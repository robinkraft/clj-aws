(defproject org.clojars.robinkraft/clj-aws "0.0.2-SNAPSHOT"
  :description "Clojure wrapper for the AWS Java SDK"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [aws-java-sdk "1.3.1"
                  :exclusions [org.codehaus.jackson/jackson-core-asl]]])
