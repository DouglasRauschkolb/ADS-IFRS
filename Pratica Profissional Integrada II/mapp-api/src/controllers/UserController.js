const mongoose = require('mongoose');

const User = mongoose.model('User');

const FinanceType = mongoose.model('FinanceType');


async function createFinanceTypes(userId) {

  const defaultFinanceType = [
    { 
      "description": "Gasolina",
      "type": "SAIDA",
      "userId": userId,
    },
    { 
      "description": "Pneus",
      "type": "SAIDA",
      "userId": userId,
    },
    { 
      "description": "Manutenção",
      "type": "SAIDA",
      "userId": userId,
    },
    { 
      "description": "Óleo",
      "type": "SAIDA",
      "userId": userId,
    },
    { 
      "description": "Alimentação",
      "type": "SAIDA",
      "userId": userId,
    },
    { 
      "description": "Outras Saídas",
      "type": "SAIDA",
      "userId": userId,
    },
    { 
      "description": "Corrida Uber",
      "type": "ENTRADA",
      "userId": userId,
    },
    { 
      "description": "Corrida Garupa",
      "type": "ENTRADA",
      "userId": userId,
    },
    { 
      "description": "Corrida 99",
      "type": "ENTRADA",
      "userId": userId,
    },
    { 
      "description": "Corrida Particular",
      "type": "ENTRADA",
      "userId": userId,
    },
    { 
      "description": "Outras Entradas",
      "type": "ENTRADA",
      "userId": userId,
    }
  ]

  defaultFinanceType.forEach(element => {
    FinanceType.create(element);
  });

}

module.exports = {
  async index(req, res) {
    const { page = 1 } = req.query;
    const users = await User.paginate({}, { page, limit: 10 });
    return res.json(users);
  },

  async store(req, res) {
    const user = await User.create(req.body);

    await createFinanceTypes(user._id);

    return res.json(user);
  },

  async show(req, res) {
    const user = await User.findById(req.params.id);
    return res.json(user);
  },

  async update(req, res) {
    const user = await User.findByIdAndUpdate(
      req.params.id, 
      req.body, 
      {
        new: true,
      }
    );
    return res.json(user);
  },

  async delete(req, res) {
    await User.findByIdAndDelete(req.params.id);
    return res.send({ msg: 'Registro apagado com sucesso!' });
  },
};
