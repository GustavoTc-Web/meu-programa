import React, { useState } from "react";
import axios from "axios";

export default function App() {
  const [nome, setNome] = useState("");
  const [cpf, setCpf] = useState("");
  const [telefone, setTelefone] = useState("");
  const [email, setEmail] = useState("");
  const [mensagem, setMensagem] = useState("");

  const handleSubmit = async () => {
    try {
      const response = await axios.post("http://localhost:8080/api/usuario/cadastro", {
        nome,
        cpf,
        telefone,
        email,
      });
      setMensagem("Cliente cadastrado com sucesso!");
      console.log(response.data);

      // limpa os campos
      setNome("");
      setCpf("");
      setTelefone("");
      setEmail("");
    } catch (error) {
      console.error(error);
      setMensagem("Erro ao cadastrar cliente");
    }
  };

  return (
    <div style={{ padding: 20 }}>
      <h1>Cadastro de Cliente</h1>
      <div>
        <label>Nome:</label>
        <input value={nome} onChange={(e) => setNome(e.target.value)} />
      </div>
      <div>
        <label>CPF:</label>
        <input value={cpf} onChange={(e) => setCpf(e.target.value)} />
      </div>
      <div>
        <label>Telefone:</label>
        <input value={telefone} onChange={(e) => setTelefone(e.target.value)} />
      </div>
      <div>
        <label>Email:</label>
        <input value={email} onChange={(e) => setEmail(e.target.value)} />
      </div>
      <button onClick={handleSubmit}>Cadastrar Cliente</button>
      <p>{mensagem}</p>
    </div>
  );
}
