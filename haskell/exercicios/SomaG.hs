module Soma where

    soma :: [Int] -> Int
    soma (h:t)
        | t == [] = h
        | otherwise = soma t + h
            

    