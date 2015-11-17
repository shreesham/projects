camera.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

board = new boolean[Gdx.graphics.getWidth() / blockSize][Gdx.graphics.getHeight() / blockSize];

Random rnd = new Random();
for(int i = 0; i < seedAmount; i++){
    int x = rnd.nextInt(board.length);
    board[x][rnd.nextInt(board[x].length)] = true;
}

for(int i = 0; i < board.length; i++){
    for(int j = 0; j < board[i].length; j++){
        if(board[i][j]){
            shapeRenderer.rect(i * blockSize, j * blockSize, 10, 10);
        }
    }
}

int neighbors = 0;
//Count live neighbors
for(int i = -1; i <= 1; i++){
    for(int j = -1; j <= 1; j++){
        if(i == 0 && j == 0)
            continue;
        int offsetX = x + i;
        int offsetY = y + j;
        //Check that offset position is within the board
        if(offsetX > 0 && offsetX < board.length && offsetY > 0 && offsetY < board[x].length){
            if(board[offsetX][offsetY])
                neighbors++;
        }
    }
}

if(board[x][y]){
    if(neighbors < 2){
        board[x][y] = false;
    } else if(neighbors > 3) {
        board[x][y] = false;
    } else{
        board[x][y] = true;
    }
} else if(neighbors == 3) {
    board[x][y] = true;
}
