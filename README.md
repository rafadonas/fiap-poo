
# Aula 01

### 🧠 Desafio de Reflexão

**Pergunta:** Por que precisamos criar uma classe Passageiro? Não seria mais fácil apenas criar variáveis soltas no main, como `String nomeAna = "Ana"` e `double saldoAna = 50.0`?  
**Pense:** E se o FiapRide tiver 1 milhão de usuários? Como a Classe ajuda a resolver isso?

Criar uma classe **Passageiro** é essencial para organização e escalabilidade do sistema.

Usar variáveis soltas no `main` pode funcionar para poucos usuários, mas se o FiapRide tiver **1 milhão de usuários**, o código ficaria impossível de manter, buscar e expandir.

Com a classe **Passageiro**, cada usuário vira um objeto que pode ser armazenado em listas, manipulado facilmente e reutilizado no sistema. Isso traz:

- melhor organização
- reutilização de código
- manutenção mais simples
- maior escalabilidade

👉 Em resumo: variáveis soltas servem apenas para exemplos pequenos; a classe permite que o sistema cresça de forma estruturada e profissional.

# Aula 02

### 🧠 Pergunta de Reflexão
**Reflita:**
Se nós podemos simplesmente fazer passageiro.saldo = passageiro.saldo + 100 diretamente no código principal, por que dá tanto trabalho criar um método específico chamado adicionarSaldo(valor) para fazer isso? Quais seriam os riscos para a nossa startup de mobilidade se deixássemos qualquer programador alterar o saldo diretamente?


Porque acesso direto quebra o controle do sistema.
Se qualquer dev puder fazer:

```java
passageiro.saldo += 100;
```

você corre riscos como:
> ❌ valores inválidos ou negativos
> ❌ fraude ou manipulação indevida
> ❌ regras de negócio ignoradas
> ❌ dificuldade de auditoria
> ❌ código inconsistente e cheio de bugs

O método adicionarSaldo(valor) centraliza validações e protege o estado do objeto, garantindo segurança, consistência e manutenção mais fácil.


## 📊 Diagrama de Classes

<p align="center">
  <img src="docs/project-diagram.png" width="700"/>
</p>