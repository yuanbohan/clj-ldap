(defproject org.clojars.pntblnk/clj-ldap "0.0.7"
  :description "Clojure ldap client (development fork of alienscience's clj-ldap)."
  :url "https://github.com/pauldorman/clj-ldap"
  :dependencies [[org.clojure/clojure "1.2.0"]
                 [com.unboundid/unboundid-ldapsdk "2.1.0"]]
  :dev-dependencies [[swank-clojure "1.3.0"]
                     [jline "0.9.94"]
                     [org.apache.directory.server/apacheds-all "1.5.5"]
                     [org.slf4j/slf4j-simple "1.5.6"]
                     [clj-file-utils "0.2.1"]
                     [lein-clojars "0.6.0"]]
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "same as Clojure"})

