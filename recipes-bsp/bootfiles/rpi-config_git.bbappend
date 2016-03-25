
KERNEL_MODULE_AUTOLOAD += "i2c_dev"

do_deploy_append() {
echo "dtparam=i2c=on" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
}

