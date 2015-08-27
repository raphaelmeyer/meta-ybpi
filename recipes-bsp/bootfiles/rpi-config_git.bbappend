do_deploy_append() {
echo "dtparam=spi=on,i2c=on" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
}
