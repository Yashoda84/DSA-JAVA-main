import java.util.*;

public class ValidParentheses {
  public boolean isValid(String s) {
    Stack<Character> st = new Stack<Character>();
    for (char ch : s.toCharArray()) {
      if (openBracket(ch)) {
        st.push(ch);
      } else {
        if (st.size() == 0) {
          return false;
        } else {
          if (matchingBracket(st.peek(), ch)) {
            st.pop();
          } else {
            return false;
          }
        }
      }
    }
    return st.size() == 0;
  }

  private boolean openBracket(char c) {
    switch (c) {
      case '(':
      case '[':
      case '{':
        return true;
      default:
        return false;
    }

  }

  private boolean matchingBracket(char s, char e) {
    if (s == '(' && e == ')') {
      return true;
    } else if (s == '{' && e == '}') {
      return true;
    } else if (s == '[' && e == ']') {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    ValidParentheses vp = new ValidParentheses();
    System.out.println(vp.isValid("({[]})"));
  }
}
