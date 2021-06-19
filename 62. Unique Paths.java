    public int uniquePaths(int m, int n) {
  int[][] paths = new int[m][n];
  
        for(int i = 0; i < paths.length; i++){
            paths[i][0] = 1;
        }
        for(int i = 1; i < paths[0].length;i++){
            paths[0][i] = 1;
            
        }
        for(int i =1; i < paths.length; i++){
              for(int j = 1; j < paths[i].length;j++){
                  paths[i][j] = paths[i -1][j] + paths[i][j-1];
              }
        }
  return paths[m-1][n-1];
    }