# lemonade-msa


Step by Step Instructions:


1. Install Minishift : 
Download Minishift from minishift.
Execute:
$ minishift profile set msa-lemonade
$ minishift config set memory 8GB
$ minishift config set cpus 3
$ minishift config set image-caching true
$ minishift config set openshift-version v3.11.0
$ minishift addons enable anyuid
$ minishift addons enable admin-user
$ minishift start
$ eval $(minishift oc-env)


2. Login to Openshift with the OC CLI in a Terminal:

$ oc login <Openshift IP>:8443 -u developer -p developer

$ oc new-project lemonade-msa


3. 
