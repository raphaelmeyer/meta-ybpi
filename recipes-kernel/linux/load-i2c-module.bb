
DESCRIPTION = "Load kernel module i2c_dev"
LICENSE = "CLOSED"

do_install_append() {
install -d ${D}/etc/modules-load.d
echo "i2c_dev" > ${D}/etc/modules-load.d/i2c_dev.conf
}

