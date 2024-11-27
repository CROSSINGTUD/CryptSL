# CrySL (formerly CryptSL)

CrySL is a domain-specific language that allows to specify the correct usage of APIs. Example specifications for the JavaCryptographicArchitecture (JCA), BouncyCastle and Tink can be found [here](https://github.com/CROSSINGTUD/Crypto-API-Rules).

## Parsing CrySL files
We implemented a parser that reads a set of `.crysl` files and parses them into Java objects. Include the following dependency in your project (replace `x.y.z` with the latest version):

```xml
<dependency>
    <groupId>de.darmstadt.tu.crossing.CrySL</groupId>
    <artifactId>CrySLParser</artifactId>
    <version>x.y.z</version>
</dependency>
```

In your program, you can import the `crysl.CrySLParser` and read a set of `.crysl` files from a directory or a `.zip` file:

```java
CrySLParser parser = new CrySLParser();
Collection<CrySLRule> rules = parser.parseRulesFromPath("path/to/directory_or_zip_file");

System.out.println("Found " + rules.size() + " for classes:");
for (CrySLRule rule : rules) {
    System.out.println(rule.getClassName());
}
```

## Publications
 Paper: https://ieeexplore.ieee.org/document/8880510

_More information can be found under the following [link](https://www.eclipse.org/cognicrypt/documentation/crysl/)._
