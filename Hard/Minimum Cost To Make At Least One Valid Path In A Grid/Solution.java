// Cost is 0 if current cell points in this direction, else 1
                int cost = (grid[x][y] == dir + 1 ? 0 : 1);

                if (dist[x][y] + cost < dist[nx][ny]) {
                    dist[nx][ny] = dist[x][y] + cost;
                    if (cost == 0) dq.offerFirst(new int[]{nx, ny});
                    else dq.offerLast(new int[]{nx, ny});
                }
            }
        }

        return dist[m - 1][n - 1];
    }
}