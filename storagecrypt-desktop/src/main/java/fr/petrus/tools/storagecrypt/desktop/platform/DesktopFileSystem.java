/*
 *  Copyright Pierre Sagne (12 december 2014)
 *
 * petrus.dev.fr@gmail.com
 *
 * This software is a computer program whose purpose is to encrypt and
 * synchronize files on the cloud.
 *
 * This software is governed by the CeCILL license under French law and
 * abiding by the rules of distribution of free software.  You can  use,
 * modify and/ or redistribute the software under the terms of the CeCILL
 * license as circulated by CEA, CNRS and INRIA at the following URL
 * "http://www.cecill.info".
 *
 * As a counterpart to the access to the source code and  rights to copy,
 * modify and redistribute granted by the license, users are provided only
 * with a limited warranty  and the software's author,  the holder of the
 * economic rights,  and the successive licensors  have only  limited
 * liability.
 *
 * In this respect, the user's attention is drawn to the risks associated
 * with loading,  using,  modifying and/or developing or reproducing the
 * software by the user in light of its specific status of free software,
 * that may mean  that it is complicated to manipulate,  and  that  also
 * therefore means  that it is reserved for developers  and  experienced
 * professionals having in-depth computer knowledge. Users are therefore
 * encouraged to load and test the software's suitability as regards their
 * requirements in conditions enabling the security of their systems and/or
 * data to be ensured and,  more generally, to use and operate it in the
 * same conditions as regards security.
 *
 * The fact that you are presently reading this means that you have had
 * knowledge of the CeCILL license and that you accept its terms.
 *
 */

package fr.petrus.tools.storagecrypt.desktop.platform;

import java.io.File;
import java.io.IOException;
import java.net.URLConnection;
import java.nio.file.Files;
import java.util.Collection;

import javax.activation.FileDataSource;

import eu.medsea.mimeutil.MimeUtil;
import fr.petrus.lib.core.Constants;
import fr.petrus.lib.core.filesystem.AbstractFileSystem;
import fr.petrus.lib.core.filesystem.FileSystem;

/**
 * The {@link FileSystem} implementation for the "Desktop" platform.
 *
 * @author Pierre Sagne
 * @since 24.08.2015
 */
public class DesktopFileSystem extends AbstractFileSystem {

    /**
     * Returns the user home dir.
     *
     * @return the user home dir
     */
    public static File getUserHomeDir() {
        return new File(getUserHomePath());
    }

    /**
     * Returns the user home path.
     *
     * @return the user home path
     */
    public static String getUserHomePath() {
        return System.getProperty("user.home");
    }

    /**
     * Creates a new {@code DesktopFileSystem} instance.
     */
    DesktopFileSystem() {}

    @Override
    public File getAppDir() {
        File userHomeDir = new File(getUserHomeDir(), Constants.FILE.APP_DIR_NAME);
        if (!userHomeDir.exists()) {
            userHomeDir.mkdirs();
        }
        return userHomeDir;
    }

    @Override
    public File getCacheFilesDir() {
        return getTempFilesDir();
    }

    @Override
    public void removeCacheFiles() {
        deleteFolder(getTempFilesDir());
    }

    /**
     * {@inheritDoc}
     * <p>This implementation uses the {@link MimeUtil} class to determine the file MIME type
     */
    @Override
    public String getMimeType(File file) {
        String type = null;
        MimeUtil.registerMimeDetector("eu.medsea.mimeutil.detector.MagicMimeMimeDetector");
        MimeUtil.registerMimeDetector("eu.medsea.mimeutil.detector.ExtensionMimeDetector");
        MimeUtil.registerMimeDetector("eu.medsea.mimeutil.detector.OpendesktopMimeDetector");
        Collection<?> mimeTypes = MimeUtil.getMimeTypes(file);
        MimeUtil.unregisterMimeDetector("eu.medsea.mimeutil.detector.MagicMimeMimeDetector");
        MimeUtil.unregisterMimeDetector("eu.medsea.mimeutil.detector.ExtensionMimeDetector");
        MimeUtil.unregisterMimeDetector("eu.medsea.mimeutil.detector.OpendesktopMimeDetector");
        if (!mimeTypes.isEmpty()) {
            type = mimeTypes.toArray()[0].toString();
        }
        if (null==type) {
            type = URLConnection.guessContentTypeFromName(file.getName());
        }
        if (null==type) {
            try {
                type = Files.probeContentType(file.toPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (null==type) {
            FileDataSource fileDataSource = new FileDataSource(file);
            type = fileDataSource.getContentType();
        }
        if (null==type) {
            type = "application/octet-stream";
        }
        return type;
    }

    /**
     * {@inheritDoc}
     * <p>This implementation uses the {@link MimeUtil} class to determine the file MIME type
     */
    @Override
    public String getMimeType(String url) {
        return getMimeType(new File(url));
    }
}
