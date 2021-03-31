#language: pt

Funcionalidade: Acessar o site da SampleApp

Cenario: Aceitar o site e preencher formulário
Dado que eu estou no site "http://sampleapp.tricentis.com/101/app.php"
E preencho o formulario Enter Vehicle Data e pressiono next
E preencho o formulario Enter Insurant Data e pressiono next
E preencho o formulario Enter Product Data e pressiono next
E preencho o formulario Select Price Option e pressiono next
E preencho o formulario Send Quote e pressiono send
Entao devo ver a mensagem "Sending e-mail success!"