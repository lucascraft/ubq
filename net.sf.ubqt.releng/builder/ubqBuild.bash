timestamp=`date "+%Y%m%d%H%M"`

eclipseVersion=Helios

originDir=/home/lb/Documents/workspace-helios/

rcpProductDir=$originDir/net.sf.ubq.mtgui
rcpProductFile=ubqt.product
rcpLauncherName=ubqt

rootDir=/UbqBuild
baseDirectory=$rootDir/Base/$eclipseVersion
buildTempDir=$rootDir/Build
deliveryDir=$rootDir/Deliveries
testDirectory=$rootDir/Tests
updateSiteDirectory=$rootDir/UpdateSite
updateSiteStagingDir=$buildTempDir/UpdateSite

eclipseAutomatedTestHome=$rootDir/Tests/eclipse-testing

productBuildDir=$baseDirectory/eclipse/plugins/org.eclipse.pde.build_3.6.0.v20100603/scripts/productBuild/

codeBaseDirectory=$originDir/

relengDir=$originDir/net.sf.ubqt.releng

mapFileName=ubqt.map

mapDirectory=$relengDir/builder/maps
mapFilePath=$mapDirectory/$mapFileName

mapsRepository=:pserver:anonymous@smartambient.cvs.sourceforge.net:/cvsroot/smartambient

eclipseLauncherPath=$baseDirectory/eclipse/plugins/org.eclipse.equinox.launcher_1.1.0.v20100507.jar

pdeScriptsDir=$productBuildDir/scripts

javaExe=/usr/bin/java

echo "$javaExe -jar $eclipseLauncherPath \
 -application org.eclipse.ant.core.antRunner \
 -buildfile $productBuildDir/productBuild.xml \
 -DoriginDir=$originDir \
 -Dbuilder=$relengDir/builder \
 -DbaseDir=$baseDirectory \
 -DproductFile=$rcpProductDir/$rcpProductFile \
 -DbuildDir=$buildTempDir \
 -DdeliveriesDirectory=$deliveryDir \
 -DtestsDir=$testDirectory \
 -Dstamp=$timestamp \
 -DmapDir=$mapDirectory \
 -DmapFile=$mapFilePath \
 -DmapFileName=$mapFileName \
 -DmapsRepoTag=$mapsRepository \
 -DproductDir=$rcpProductDir \
 -DlauncherName=$rcpLauncherName \
 -DcodeBaseDir=$codeBaseDirectory \
 -DupdateSiteDir=$updateSiteDirectory \
 -DupdateSiteStagingLocation=$updateSiteStagingDir \
 -DacmeVersion=1.0.0 \
 -DisNightlyBuild \
 -DeclipseAutomatedTestHome=$eclipseAutomatedTestHome \
 -DeclipseLauncherPath=$eclipseLauncherPath \
 -DarchivePrefix=$archivePrefix \
 -DjavaExe=$javaExe \
 -Dvm=$javaExe \
 -Djunit-report-output=$eclipseAutomatedTestHome/results \
 -Dtimeout=72000"
 
$javaExe -jar $eclipseLauncherPath \
 -application org.eclipse.ant.core.antRunner \
 -buildfile $productBuildDir/productBuild.xml \
 -DoriginDir=$originDir \
 -Dbuilder=$relengDir/builder \
 -DbaseDir=$baseDirectory \
 -DproductFile=$rcpProductDir/$rcpProductFile \
 -DbuildDir=$buildTempDir \
 -DdeliveriesDirectory=$deliveryDir \
 -DtestsDir=$testDirectory \
 -Dstamp=$timestamp \
 -DmapDir=$mapDirectory \
 -DmapFile=$mapFilePath \
 -DmapFileName=$mapFileName \
 -DmapsRepoTag=$mapsRepository \
 -DproductDir=$productBuildDir \
 -DlauncherName=$rcpLauncherName \
 -DcodeBaseDir=$codeBaseDirectory \
 -DupdateSiteDir=$updateSiteDirectory \
 -DupdateSiteStagingLocation=$updateSiteStagingDir \
 -DacmeVersion=1.0.0 \
 -DisNightlyBuild \
 -DeclipseAutomatedTestHome=$eclipseAutomatedTestHome \
 -DeclipseLauncherPath=$eclipseLauncherPath \
 -DarchivePrefix=$archivePrefix \
 -DjavaExe=$javaExe \
 -Dvm=$javaExe \
 -Djunit-report-output=$eclipseAutomatedTestHome/results \
 -Dtimeout=72000
 

 
