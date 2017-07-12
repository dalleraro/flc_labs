default: scanner parser
	javac *.java

scanner:
	jflex scanner.jflex

parser:
	java java_cup.MainDrawTree -parser parser parser.cup

clean:
	rm -fr parser.java scanner.java sym.java
	rm -vfr *.class
	rm -vfr *.*~
