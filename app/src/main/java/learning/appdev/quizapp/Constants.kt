package learning.appdev.quizapp

object Constants {

    const val USER_Name: String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions() : ArrayList<Question>{
        val questionsList  = ArrayList<Question>()


        val que1 = Question(1, "Which of those doesn’t have an index based structure?","List",
            "Set",
            "Map",
            "Non of them",
            2)

        val que2 = Question(2, "java.util.Collections is a: ?","Class",
            "Interface",
            "Object",
            "Non of them",
            1)

        val que3 = Question(3, "Methods such as reverse, shuffle are offered in: ?","Collection",
            "Object",
            "Collections",
            "Apache Commons Collections ",
            3)

        val que4 = Question(4, "java.util.Collections is a: ?","Class",
            "Interface",
            "Object",
            "Non of them",
            1)

        val que5 = Question(5, "Which component is used to compile, debug and execute the java programs?","JRE",
            "JIT",
            "JDK",
            "JVM",
            3)


        val que6 = Question(6, "j. Which one of the following is not a Java feature?","Object Oriented",
            "Use of Pointers",
            "Portable",
            "Dynamic and Extensible",
            2)

        val que7 = Question(7, "Which of these cannot be used for a variable name in Java?","identifier & keyword",
            " identifier",
            "keyword",
            "Non of them",
            3)

        val que8 = Question(8, " What is the extension of java code files?",".js",
            ".py",
            ".java",
            ".kt",
            3)

        val que9 = Question(9, "Which environment variable is used to set the java path?","MAVEN_Path",
            "JavaPATH",
            "JAVA",
            "JAVA_HOME",
            4)

        val que10 = Question(10, "Which of the following is not an OOPS concept in Java?","polymorphism",
            "Inheritance",
            "Compilation",
            "Encapsulation",
            3)
        val que11 = Question(11, "Which of these are selection statements in Java?","break",
            "continue",
            "if()",
            "for()",
            3)
        val que12 = Question(12, "Which of the following is a superclass of every class in Java?","ArrayList",
            "Abstract class",
            "Object class",
            "String",
            3)
        val que13 = Question(13, "Which of these packages contains the exception Stack Overflow in Java?","java.io",
            "java.system",
            "java.lang",
            "java.util",
            3)
        val que14 = Question(14, "Which class provides system independent server side implementation?","Server",
            "ServerReader",
            "Socket",
            "ServerSocket",
            4)
        val que15 = Question(15, " How to sort elements of ArrayList?","Collection.sort(listObj);",
            "Collections.sort(listObj);",
            "istObj.sort();",
            "Sorter.sortAsc(listObj);",
            2)
        val que16 = Question(16, "How is Arrays.asList() different than the standard way of initialising List?","Both are same",
            "Arrays.asList() throws compilation error",
            "Arrays.asList() returns a fixed length list and doesn’t allow to add or remove elements",
            "We cannot access the list returned using Arrays.asList()",
            3)
        val que17 = Question(17, "What is the worst case complexity of accessing an element in ArrayList?","O(n)",
            "O(1)",
            "O(nlogn)",
            "O(2)",
            2)
        val que18 = Question(18, "Which of these method is used to add an element to the start of a LinkedList object?","add()",
            "first()",
            "addFirst()",
            "AddFirst()",
            3)
        val que19 = Question(19, "What is the difference between length() and size() of ArrayList?","length() and size() return the same value",
            "length() is not defined in ArrayList",
            "size() is not defined in ArrayList",
            "length() returns the capacity of ArrayList and size() returns the actual number of elements stored in the list",
            4)
        val que20 = Question(20, "Which of this method is used to change an element in a LinkedList Object?","change()",
            "set()",
            "redo()",
            "add()",
            2)




        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)
        questionsList.add(que6)
        questionsList.add(que7)
        questionsList.add(que8)
        questionsList.add(que9)
        questionsList.add(que10)
        questionsList.add(que11)
        questionsList.add(que12)
        questionsList.add(que13)
        questionsList.add(que14)
        questionsList.add(que15)
        questionsList.add(que16)
        questionsList.add(que17)
        questionsList.add(que18)
        questionsList.add(que19)
        questionsList.add(que20)

        return questionsList
    }
}