(defproject org.clojars.yuanbohan/clj-ldap "0.0.17"
  :description "Clojure ldap client."
  :url "https://github.com/yuanbohan/clj-ldap"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.unboundid/unboundid-ldapsdk "4.0.0"]]
  :profiles {:test {:dependencies [[lein-clojars "0.9.1"]]}}
  :aot [clj-ldap.client]
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "same as Clojure"})
