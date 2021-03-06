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

package fr.petrus.tools.storagecrypt.desktop;

/**
 * This interface contains the constants used by the classes of the "Desktop" module.
 *
 * @author Pierre Sagne
 * @since 27.10.2015
 */
public class DesktopConstants {
    public interface OPTIONS {
        String SETTINGS_FILE = "settings.properties";
        String PROPERTY_DATABASE_ENCRYPTION_PASSWORD = "database.encryption.password";
        String PROPERTY_PROXY_CONFIGURATION = "proxy.configuration";
        String PROPERTY_PROXY_ADDRESS = "proxy.address";
        String PROPERTY_PROXY_PORT = "proxy.port";
    }

    public interface RESOURCES {
        String IC_CLOUD           = "/res/drawable/ic_cloud_black_24dp.png";
        String IC_FOLDER          = "/res/drawable/ic_folder_black_24dp.png";
        String IC_FILE            = "/res/drawable/ic_file_black_24dp.png";
        String IC_NEXT            = "/res/drawable/ic_next_black_24dp.png";
        String IC_CLOUD_ADD       = "/res/drawable/ic_cloud_add_black_36dp.png";
        String IC_FOLDER_ADD      = "/res/drawable/ic_folder_add_black_36dp.png";
        String IC_FILE_ADD        = "/res/drawable/ic_file_add_black_36dp.png";
        String IC_SYNC_BLACK      = "/res/drawable/ic_sync_black_24dp.png";
        String IC_SYNC_GREEN      = "/res/drawable/ic_sync_green_24dp.png";
        String IC_SYNC_RED        = "/res/drawable/ic_sync_red_24dp.png";
        String IC_SYNC_VIOLET     = "/res/drawable/ic_sync_violet_24dp.png";
        String IC_DELETE_BLACK    = "/res/drawable/ic_delete_black_24dp.png";
        String IC_DELETE_GREEN    = "/res/drawable/ic_delete_green_24dp.png";
        String IC_DELETE_RED      = "/res/drawable/ic_delete_red_24dp.png";
        String IC_DELETE_VIOLET   = "/res/drawable/ic_delete_violet_24dp.png";
        String IC_DOWNLOAD_BLACK  = "/res/drawable/ic_download_black_24dp.png";
        String IC_DOWNLOAD_GREEN  = "/res/drawable/ic_download_green_24dp.png";
        String IC_DOWNLOAD_RED    = "/res/drawable/ic_download_red_24dp.png";
        String IC_DOWNLOAD_VIOLET = "/res/drawable/ic_download_violet_24dp.png";
        String IC_UPLOAD_BLACK    = "/res/drawable/ic_upload_black_24dp.png";
        String IC_UPLOAD_GREEN    = "/res/drawable/ic_upload_green_24dp.png";
        String IC_UPLOAD_RED      = "/res/drawable/ic_upload_red_24dp.png";
        String IC_UPLOAD_VIOLET   = "/res/drawable/ic_upload_violet_24dp.png";
    }
}
