import java.util.Stack;

public class LL1Parser {
    public static boolean valid(String[] word) {
        int j = 0;
        while (!word[j].equalsIgnoreCase("err") && !word[j].equalsIgnoreCase("@")){
            j++;
        }
        if (word[j].equalsIgnoreCase("err")){
            return false;
        } else {
            String state;
            Stack myStack = new Stack();

            state = "i";
            myStack.push("#");
            state = "p";
            myStack.push("S");

            int i = 0;
            String symbol1 = word[i];
//            String symbol2;
//            if (symbol1.equalsIgnoreCase("@")){
//                symbol2 = "@";
//            } else {
//                symbol2 = word[i+1];
//            }

            String top = (String) myStack.peek();
            String peek;

            while (!top.equalsIgnoreCase("#")) {
                if(top.equalsIgnoreCase("S")) {
                    if (symbol1.equalsIgnoreCase("16")) {
                            myStack.pop();
                            myStack.push("K");
                            myStack.push("T");
                            myStack.push("J");
                            myStack.push("Y");
                            myStack.push("X");
                    } else {
                        return false;
                    }
                } else if (top.equalsIgnoreCase("X")){
                    myStack.pop();
                    myStack.push("16");
                } else if (top.equalsIgnoreCase("16")){
                    if (!symbol1.equalsIgnoreCase("16")) {
                        return false;
                    } else {
                        peek = (String) myStack.peek();
                        if (peek.equalsIgnoreCase("16")){
                            myStack.pop();
                            i++;
                            symbol1 = word[i];
                        }
                    }
                } else if (top.equalsIgnoreCase("Y")){
                    myStack.pop();
                    myStack.push("12");
                    myStack.push("C");
                    myStack.push("15");
                    myStack.push("B");
                    myStack.push("15");
                    myStack.push("A");
                    myStack.push("11");
                } else if (top.equalsIgnoreCase("11")){
                    if (!symbol1.equalsIgnoreCase("11")) {
                        return false;
                    } else {
                        peek = (String) myStack.peek();
                        if (peek.equalsIgnoreCase("11")){
                            myStack.pop();
                            i++;
                            symbol1 = word[i];
                        }
                    }
                } else if (top.equalsIgnoreCase("A")) {
                    if(symbol1.equalsIgnoreCase("18")){
                        myStack.pop();
                        myStack.push("N");
                        myStack.push("2");
                        myStack.push("V");
                        myStack.push("18");
                    } else {
                        return false;
                    }
                } else if (top.equalsIgnoreCase("18")) {
                    if (!symbol1.equalsIgnoreCase("18")) {
                        return false;
                    } else {
                        peek = (String) myStack.peek();
                        if (peek.equalsIgnoreCase("18")){
                            myStack.pop();
                            i++;
                            symbol1 = word[i];
                        }
                    }
                } else if (top.equalsIgnoreCase("V")) {
                    if (symbol1.equalsIgnoreCase("1")){
                        myStack.pop();
                        myStack.push("1");
                    } else {
                        return false;
                    }
                } else if (top.equalsIgnoreCase("1")) {
                    if (!symbol1.equalsIgnoreCase("1")) {
                        return false;
                    } else {
                        peek = (String) myStack.peek();
                        if (peek.equalsIgnoreCase("1")) {
                            myStack.pop();
                            i++;
                            symbol1 = word[i];
                        }
                    }
                } else if (top.equalsIgnoreCase("2")){
                    if (!symbol1.equalsIgnoreCase("2")) {
                        return false;
                    } else {
                        peek = (String) myStack.peek();
                        if (peek.equalsIgnoreCase("2")) {
                            myStack.pop();
                            i++;
                            symbol1 = word[i];
                        }
                    }
                } else if (top.equalsIgnoreCase("N")){
                    myStack.pop();
                    myStack.push("17");
                } else if (top.equalsIgnoreCase("17")) {
                    if (!symbol1.equalsIgnoreCase("17")) {
                        return false;
                    } else {
                        peek = (String) myStack.peek();
                        if (peek.equalsIgnoreCase("17")) {
                            myStack.pop();
                            i++;
                            symbol1 = word[i];
                        }
                    }
                } else if (top.equalsIgnoreCase("15")) {
                    if (!symbol1.equalsIgnoreCase("15")) {
                        return false;
                    } else {
                        peek = (String) myStack.peek();
                        if (peek.equalsIgnoreCase("15")) {
                            myStack.pop();
                            i++;
                            symbol1 = word[i];
                        }
                    }
                } else if (top.equalsIgnoreCase("B")) {
                    if(symbol1.equalsIgnoreCase("1")){
                        myStack.pop();
                        myStack.push("N");
                        myStack.push("M");
                        myStack.push("V");
                    } else {
                        return false;
                    }
                } else if (top.equalsIgnoreCase("V")) {
                    if (symbol1.equalsIgnoreCase("1")) {
                        myStack.pop();
                        myStack.push("1");
                    } else {
                        return false;
                    }
                }else if (top.equalsIgnoreCase("1")) {
                    if (!symbol1.equalsIgnoreCase("1")) {
                        return false;
                    } else {
                        peek = (String) myStack.peek();
                        if (peek.equalsIgnoreCase("1")) {
                            myStack.pop();
                            i++;
                            symbol1 = word[i];
                        }
                    }
                } else if (top.equalsIgnoreCase("M")) {
                    if (symbol1.equalsIgnoreCase("3")){
                        myStack.pop();
                        myStack.push("3");
                    } else if (symbol1.equalsIgnoreCase("4")) {
                        myStack.pop();
                        myStack.push("4");
                    } else if (symbol1.equalsIgnoreCase("5")) {
                        myStack.pop();
                        myStack.push(5);
                    } else if (symbol1.equalsIgnoreCase("6")) {
                        myStack.pop();
                        myStack.push(6);
                    } else {
                        return false;
                    }
                } else if (top.equalsIgnoreCase("3")) {
                    if (!symbol1.equalsIgnoreCase("3")) {
                        return false;
                    } else {
                        peek = (String) myStack.peek();
                        if (peek.equalsIgnoreCase("3")) {
                            myStack.pop();
                            i++;
                            symbol1 = word[i];
                        }
                    }
                } else if (top.equalsIgnoreCase("4")) {
                    if (!symbol1.equalsIgnoreCase("4")) {
                        return false;
                    } else {
                        peek = (String) myStack.peek();
                        if (peek.equalsIgnoreCase("4")) {
                            myStack.pop();
                            i++;
                            symbol1 = word[i];
                        }
                    }
                } else if (top.equalsIgnoreCase("5")) {
                    if (!symbol1.equalsIgnoreCase("5")) {
                        return false;
                    } else {
                        peek = (String) myStack.peek();
                        if (peek.equalsIgnoreCase("5")) {
                            myStack.pop();
                            i++;
                            symbol1 = word[i];
                        }
                    }
                } else if (top.equalsIgnoreCase("6")) {
                    if (!symbol1.equalsIgnoreCase("6")) {
                        return false;
                    } else {
                        peek = (String) myStack.peek();
                        if (peek.equalsIgnoreCase("6")) {
                            myStack.pop();
                            i++;
                            symbol1 = word[i];
                        }
                    }
                } else if (top.equalsIgnoreCase("N")){
                    myStack.pop();
                    myStack.push("17");
                } else if (top.equalsIgnoreCase("17")) {
                    if (!symbol1.equalsIgnoreCase("17")) {
                        return false;
                    } else {
                        peek = (String) myStack.peek();
                        if (peek.equalsIgnoreCase("17")) {
                            myStack.pop();
                            i++;
                            symbol1 = word[i];
                        }
                    }
                } else if (top.equalsIgnoreCase("15")) {
                    if (!symbol1.equalsIgnoreCase("15")) {
                        return false;
                    } else {
                        peek = (String) myStack.peek();
                        if (peek.equalsIgnoreCase("15")) {
                            myStack.pop();
                            i++;
                            symbol1 = word[i];
                        }
                    }
                } else if (top.equalsIgnoreCase("C")) {
                    if(symbol1.equalsIgnoreCase("7")){
                        myStack.pop();
                        myStack.push("7");
                    } else if(symbol1.equalsIgnoreCase("8")) {
                        myStack.pop();
                        myStack.push("8");
                    } else {
                        return false;
                    }
                } else if (top.equalsIgnoreCase("7")) {
                    if (!symbol1.equalsIgnoreCase("7")) {
                        return false;
                    } else {
                        peek = (String) myStack.peek();
                        if (peek.equalsIgnoreCase("7")) {
                            myStack.pop();
                            i++;
                            symbol1 = word[i];
                        }
                    }
                } else if (top.equalsIgnoreCase("8")) {
                    if (!symbol1.equalsIgnoreCase("8")) {
                        return false;
                    } else {
                        peek = (String) myStack.peek();
                        if (peek.equalsIgnoreCase("8")) {
                            myStack.pop();
                            i++;
                            symbol1 = word[i];
                        }
                    }
                } else if (top.equalsIgnoreCase("12")){
                    if (!symbol1.equalsIgnoreCase("12")) {
                        return false;
                    } else {
                        peek = (String) myStack.peek();
                        if (peek.equalsIgnoreCase("12")){
                            myStack.pop();
                            i++;
                            symbol1 = word[i];
                        }
                    }
                } else if (top.equalsIgnoreCase("J")){
                    myStack.pop();
                    myStack.push("13");
                } else if (top.equalsIgnoreCase("13")){
                    if (!symbol1.equalsIgnoreCase("13")) {
                        return false;
                    } else {
                        peek = (String) myStack.peek();
                        if (peek.equalsIgnoreCase("13")){
                            myStack.pop();
                            i++;
                            symbol1 = word[i];
                        }
                    }
                } else if (top.equalsIgnoreCase("K")){
                    myStack.pop();
                    myStack.push("14");
                } else if (top.equalsIgnoreCase("14")){
                    if (!symbol1.equalsIgnoreCase("14")) {
                        return false;
                    } else {
                        peek = (String) myStack.peek();
                        if (peek.equalsIgnoreCase("14")){
                            myStack.pop();
                            i++;
                            symbol1 = word[i];
                        }
                    }
                } else if
            }
        }
    }
}
