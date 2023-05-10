const { Model, DataTypes } = require('sequelize');
const sequelize = require('../../database/index');
const bcrypt = require('bcryptjs');

class User extends Model {}
User.init(
  {
    firstName: DataTypes.STRING,
    lastName: DataTypes.STRING,
    email: DataTypes.STRING,
    password: DataTypes.STRING,
  },
  {
    sequelize,
    modelName: 'User',
  }
);

User.beforeSave(async (user) => {
  if (user.password) {
    user.password = await bcrypt.hash(user.password, 8);
  }
});

sequelize.sync();
module.exports = User;
