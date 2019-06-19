; Aula 01 - Primeiros Passos com programacao funcional

; Executando o primeiro codigo
(+ 10 2) ; 12
(* 7 6) ; 42
(/ 6 3) ; 2

; Somas de somas
(+ 2 (+ 5 5) ) ; 12
(+ 4 (+ 1 2) ) ; 7
(- (+ 4 (+ 1 20) ) 7) ; 18
(+ (* 5 (/ 10 2) ) 1) ; 26

; Criando funcoes
(defn mult2 [x] (* x 2))

(defn mult-square [x] (* x (+ 2 x) ))

; Mais funcoes
(defn pow3 [x] (* x (Math/pow x 2) ))