# lemonade-msa


1. Download Minishift from minishift(https://github.com/minishift/minishift/releases)

2. Execute:
	
	$ minishift profile set msa-tutorial

	$ minishift config set memory 8GB

	$ minishift config set cpus 3

	$ minishift config set image-caching true

	$ minishift config set openshift-version v3.11.0

	$ minishift addons enable anyuid
	
	$ minishift addons enable admin-user

	$ minishift start

	$ eval $(minishift oc-env)



3. Open the Web Console:

     Open Openshift console: https://<openshift_ip>:8443/console/
      (Accept the certificate and proceed)
     
      Log in Openshift 
	Use developer/developer as your credentials


4. Login to Openshift using the OC CLI and create a project:

    $ oc login < Openshift IP >:8443 -u developer -p developer

	$ oc new-project lemonade-msa


5. Build all the projects using ./gradlew build

6. For each micro service (lemonade-supply, cup-supply and beverage-vendor) use the following to install within this lemonade-msa project:

	oc new-build --strategy docker --binary --name < msa-name >

	oc start-build < msa-name > --from-dir=. --follow

	oc new-app < msa-name > -l app=< msa-name >

	oc expose < msa-name >


7.  To Test the micro service beverage-vendor which routes to both lemonade-supply and cup-supply, curl this, you should see a son payload:

	curl http://beverage-vendor-< Openshift-Route >/beverage/large


        











