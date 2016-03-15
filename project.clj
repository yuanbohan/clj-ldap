(defproject bskinny/clj-ldap "0.0.10"
  :description "Clojure ldap client (development fork of pauldorman's clj-ldap)."
  :url "https://github.com/bskinny/clj-ldap"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.unboundid/unboundid-ldapsdk "3.1.0"]]
  :profiles {:test {:dependencies [[lein-clojars "0.9.1"]]}}
  :aot [clj-ldap.client]
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "same as Clojure"})
