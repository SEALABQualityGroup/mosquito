del C:\Programmi\apache-tomcat-6.0.13\webapps\axis\WEB-INF\classes\di /S /Q
xcopy "C:\workspace\MOSQUITO 1.6\MOSQUITO 1.6\bin\di" "C:\Programmi\apache-tomcat-6.0.13\webapps\axis\WEB-INF\classes\di" /S
del C:\Programmi\apache-tomcat-6.0.13\webapps\axisM13\WEB-INF\classes\di /S /Q
xcopy "C:\workspace\MOSQUITO 1.6\MOSQUITO 1.6\bin\di" "C:\Programmi\apache-tomcat-6.0.13\webapps\axisM13\WEB-INF\classes\di" /S
copy "C:\workspace\MOSQUITO 1.6\MOSQUITO 1.6\properties\errors.conf" "C:\Programmi\apache-tomcat-6.0.13\webapps\MOSQUITO_CONF\errors.conf"
C:\Programmi\apache-tomcat-6.0.13\bin\startup.bat
