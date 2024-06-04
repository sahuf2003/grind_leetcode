class Solution {
public:
    void rotate(vector<vector<int>>& matrix) {
      int row = matrix[0].size();
      for(int i=0;i<row;i++){
        for(int j=i;j<row;j++){
            swap( matrix[i][j],matrix[j][i]);
        }
      }
      for(int i =0;i<row;i++)
        {
            for(int j=0;j<row/2;j++ )
            {
                swap(matrix[i][j],matrix[i][row-j-1]);
            }
        }
    }
};