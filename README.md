# Ideal shop
Distributed shop-like system made for training purposes.  

### Environment prerequisites:

``` bash 
✗ java -version
java version "13.0.1" 2019-10-15
Java(TM) SE Runtime Environment (build 13.0.1+9)
Java HotSpot(TM) 64-Bit Server VM (build 13.0.1+9, mixed mode, sharing)

✗ mvn -v
Apache Maven 3.5.4 (1edded0938998edf8bf061f1ceb3cfdeccf443fe; 2018-06-17T21:33:14+03:00)
Maven home: /usr/local/Cellar/maven/3.5.4/libexec
Java version: 13.0.1, vendor: Oracle Corporation, runtime: /Library/Java/JavaVirtualMachines/jdk-13.0.1.jdk/Contents/Home
Default locale: en_BY, platform encoding: UTF-8
OS name: "mac os x", version: "10.14.5", arch: "x86_64", family: "mac"

```
### Get the latest code:
To get the latest code using git, simply type: 
```bash
git clone https://github.com/vlsidlyarevich/ideal-shop.git
```

### Build and run:
Go to project root folder and type in your favourite terminal:
```bash
mvn clean install
java -jar target/*.jar
```
To run on specific Spring profile type the following:
```bash
mvn clean install
java -jar -Dspring.profiles.active={name} target/*.jar
```
Where {name} is a placeholder for your spring profile name.

### Useful links:

* [Wiki](https://github.com/vlsidlyarevich/ideal-shop/wiki)
* [Repo](https://github.com/vlsidlyarevich/ideal-shop)
* [Project board](https://github.com/vlsidlyarevich/ideal-shop/projects/1)