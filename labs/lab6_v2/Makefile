default: scanner parser
	javac *.java

scanner:
	jflex scanner.jflex

parser:
	java java_cup.Main -expect 2 -parser parser parser.cup

clean:
	rm -fr parser.java scanner.java sym.java
	rm -vfr *.class
	rm -vfr *.*~

run: default
	java Main bubble.c bubble.asm
	java -jar interpreter.jar bubble.asm 1
