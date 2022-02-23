# Java 9 Modules

-  How to create module
   - create file with name module-info.java
   - module [module_name]{}
   
-  module-info.java keywords
    - exports [package] [to] [module>]
    - requires [module]
    - opens package [to] [module]
    - provides [interface] [with] [implementation]
    - uses [interface]
