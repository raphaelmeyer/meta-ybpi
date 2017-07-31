# Base this image on rpi-hwup-image
include recipes-core/images/rpi-hwup-image.bb

IMAGE_INSTALL += " \
    lighttpd \
    "

IMAGE_FEATURES += " \
    debug-tweaks \
    package-management \
    ssh-server-dropbear \
    "

