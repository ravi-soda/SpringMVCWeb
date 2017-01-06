today changes
1. in web.xml add below code
<resource-ref>
    <description>Patching Portal JNDI Datasource</description>
    <res-ref-name>jdbc/DSPatchingPortal</res-ref-name>
    <res-type>javax.sql.DataSource</res-type>
    <res-auth>Container</res-auth>
  </resource-ref>
  
  
