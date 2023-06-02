module Soma where

    soma :: [Int] -> Int
    --caso base
    soma [] = 0
    --passo
    soma (h:t) = soma t + h

    