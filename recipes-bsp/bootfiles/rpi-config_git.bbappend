
KERNEL_MODULE_AUTOLOAD += "i2c_dev"
#module_autoload_i2c_dev = "i2c_dev"

do_deploy_append() {
echo "dtparam=i2c=on" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
#mkdir -p ${DEPLOYDIR}/etc/modules-load.d/i2c.conf
#echo "i2c_dev" > ${DEPLOYDIR}/etc/modules-load.d/i2c.conf
}

