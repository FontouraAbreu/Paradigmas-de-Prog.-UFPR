module Power where

pow :: Int -> Int -> Int

pow x n
    | n == 0 = 1
    | otherwise = x * pow x (n-1)