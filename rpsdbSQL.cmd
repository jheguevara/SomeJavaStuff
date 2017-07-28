@rem     ******************************************
@rem     this script starts the ij tool
@rem     ******************************************

@rem     change the following line to 'echo on' for debugging
@echo off

setlocal


@rem     call dbSetenv.cmd script to set up the Derby environment
@rem     *************************************************
@rem     this script sets up the environment for Derby
@rem     *************************************************

@echo off

@rem This environment variable names the databse
set DB_NAME=jdbc:derby://localhost:1527/rpsdb

@rem This environment variable points to the Derby install directory
set DERBY_INSTALL=../DerbyLib

@rem We use the following in dbStart.cmd to deal with Java 7 security issues
set DERBY_PORT=1527

set CLASSPATH=.;%DERBY_INSTALL%\derby.jar;%DERBY_INSTALL%\derbytools.jar;%DERBY_INSTALL%\derbynet.jar;%DERBY_INSTALL%\derbyclient.jar;%CLASSPATH%


title ij

@rem     start ij, connecting as username/password: guest/password
java -Dij.driver=org.apache.derby.jdbc.ClientDriver -Dij.database=%DB_NAME% -Dij.user=guest -Dij.password=password org.apache.derby.tools.ij

endlocal
