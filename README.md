This code is the result of a coding dojo on wednesday 19th of September
2012.

Running the code
----------

Install 2 [Leiningen](http://leiningen.org/) and simply run

```bash
lein midje --lazytest
```

You can also use Maven 3 to do this

```bash
mvn clean test
```

Maven will not fail, when tests are failing!

When you import the Maven project in IntelliJ IDEA, you have to add the Clojure
Facet manually, since it is not detected. The Clojure Facet allows you to start
REPL.

## License

Copyright © 2012 FIXME

Distributed under the Eclipse Public License, the same as Clojure.
