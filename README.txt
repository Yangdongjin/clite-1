Nate Moore

CLite Java Parser

There are four folders:
	src - All source files
	bin - Compiled class files
	doc - Generated javadocs (open Index.html to view)
	programs - Test programs to run with interpreter

To run, do 'java Runner ../programs/[program name]'. It should work with all the test programs. I removed all the main methods from everything except the runner, but I suppose I could add them back if you wanted to test each part individually.

I managed to complete all the parts that were labeled "student exercise" in the code (and then some), which I'm pretty sure covers all the labs (I didn't follow the labs, just "played it by ear").
Overall, this whole thing was almost trivial for me; I've implemented a lot of stuff similar to this before for various projects.

I kind of tore up the source code that the book gave me. I created four packages- syntax, parser, typing, and interpreter- to further distinguish the different parts of the program from each other. I also added a TON of comments and full javadocs.

Inside of the 'syntax' package is the abstract syntax. I split the abstract syntax up into multiple classes inside of a few seperate subpackages, rather than having them all crammed into one file like they had it (the abstract syntax didn't make much sense to me until I did this, then it became immediately clear).

Inside of the 'parser' package is the Lexer and the Parser. No drastic changes here.

Inside of the 'typing' package is the StaticTypeChecker, TypeTransformer and TypeMap.

Inside of the 'interpreter' package is the Semantics and State. I renamed the "Semantics" class to "Interpreter" because the name made more sense to me.

I didn't get around to implementing arrays, but I could probably do so easily.