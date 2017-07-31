# Base this image on rpi-hwup-image
include recipes-core/images/rpi-hwup-image.bb

IMAGE_INSTALL += " \
  load-i2c-module \
  libstdc++ \
  userland \
  lighttpd \
  "

IMAGE_FEATURES += " \
  debug-tweaks \
  package-management \
  ssh-server-dropbear \
  "

