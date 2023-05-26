module Media where

-- escreva uma funcao com guardas e where
-- que calcula a media de 3 notas e retorna true e for >=7

mediaP :: Float -> Float -> Float -> String

mediaP p1 p2 p3
    | media >= 7 = "aprovado"
    | otherwise = "reprovado"
    where
        media = (p1 + p2 + p3)/3