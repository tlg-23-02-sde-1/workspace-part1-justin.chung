/**
 *  This module is the client module and it contains this package:
 *  As the client module it does not export anything
 *  But does not need to declare a dependency on anything
 */

module com.entertainment.client {
    // which packages does this module require?
    // This module will get access to the public classes in exported packages.
    requires com.entertainment;
}