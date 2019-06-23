; Listas e suas Funções

; Criando listas
(def numeros [1 2 3 4 5])
(def carros [50000.0, 60000.0])

; Remove
(remove (fn [num] (= (rem num 2) 1)) numeros)

; Map
(map (fn [num] (* num 3)) numeros)

; A funcao filter
(filter (fn [x] (or (< x 2) (> x 4))) numeros)

; Conjuntos
(def conjunto #{"A" "L" "U" "R"})
(contains? palavra "A")
(contains? palavra "O")