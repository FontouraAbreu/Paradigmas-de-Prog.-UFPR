module Triangulo where

-- if-then-else

-- Função que recebe 3 números e determina se eles formam um triângulo
-- Se a soma de dois lados for menor que o terceiro, não é triângulo

isTriangulo :: Int -> Int -> Int -> Bool

isTriangulo a b c = if (a+b) < c then False else True

-- guards

isTrianguloG :: Int -> Int -> Int -> Bool

isTrianguloG a b c
    | (b+c) > a = True
    | otherwise = False