execute as root:

cd /var/opt/intershop

mkdir projects

chown training:isgrp1 projects

chmod g+ws projects

cd projects


exexute as training:

mkdir target



exexute as training:

cd /var/opt/intershop/projects

git clone https://github.com/ShafeequeVelo/WarehouseManagement.git

cd WarehouseManagement

git checkout development



edit intershop.properties file

execute as root:

vi /eserver1/intershop.properties



do this changes ->

IS_SOURCE:/var/opt/intershop/projects/WarehouseManagement/source

IS_TARGET:/var/opt/intershop/projects/target



Open Intershop studio



Import Cartridges:


File > Import > Intershop Studio > Existing Cartridge Projects into Workspace

You are ready for a Start

