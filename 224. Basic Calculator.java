    public int calculate(String s) {
       int sum = 0;
        int sing = 1;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
          if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
               int num = 0;
              while(i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
               num = num * 10 + s.charAt(i) - '0';
                  i++;
              }
              sum += num*sing;
              i--;
          }else if(s.charAt(i) == '+'){
              sing = 1;
          }else if(s.charAt(i) == '-'){
              sing = -1;
          }else if(s.charAt(i) == '('){
              stack.push(sum);
              stack.push(sing);
              sum = 0;
              sing = 1;
          }else if(s.charAt(i) == ')'){
             sum = stack.pop()* sum;
              sum += stack.pop();
          }
              
        }
        return sum;
    }