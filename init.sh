#!/bin/bash

createProject() {
	# 1-group
	# 2-project name
	# 3-project directory
	# 4-dependencies
	mkdir -p src/$1/$3
	curl https://start.spring.io/starter.zip -d dependencies=$4 -d bootVersion=2.2.0.RELEASE -d type=gradle-project -d applicationName=$2 -d artifactId=$3 -d baseDir=$3 -o $3.zip

	unzip $3.zip
    rm $3.zip
    mv $3/ src/$1/
}

#createProject 1_discovery DiscoveryServer 1_discovery_server cloud-eureka-server 
#createProject 1_discovery DiscoveryClient 1_discovery_client cloud-eureka,web,devtools,actuator

###createProject admin AdminServer admin_admin codecentric-spring-boot-admin-server
###createProject admin AdminClient admin_client codecentric-spring-boot-admin-client,web,devtools,actuator

#createProject 2_api_gateway ZuulServer 2_zuul cloud-zuul
#createProject 2_api_gateway RouteBooks 2_books web,devtools,actuator
#createProject 2_api_gateway RouteCalc 2_calc web,devtools,actuator


#createProject load_balancing DiscoveryServer load_balancing_discovery cloud-eureka-server
#createProject load_balancing ZuulServer load_balancing_zuul cloud-zuul,cloud-eureka
#createProject load_balancing LoadBalancingBooks load_balancing_books cloud-eureka,web,devtools,actuator


#createProject ribbon RibbonServer ribbon_server web,devtools
#createProject ribbon RibbonClientApp ribbon_client cloud-ribbon,web,devtools

#createProject ribbon_eureka RibbonDiscoveryServer ribbon_discovery_server cloud-eureka,web,devtools
#createProject ribbon_eureka RibbonDiscoveryEureka ribbon_discovery_eureka cloud-eureka-server
#createProject ribbon_eureka RibbonDiscoveryClient ribbon_discovery_client cloud-ribbon,cloud-eureka,web,devtools

