const { Model, DataTypes } = require('sequelize');
const sequelize = require('../../database/index');

class Presentation extends Model {}
Presentation.init(
  {
    title: DataTypes.STRING,
    shortText: DataTypes.STRING,
    longText: DataTypes.STRING,
    image: DataTypes.BLOB,
    userId: DataTypes.INTEGER,
  },
  {
    sequelize,
    modelName: 'Presentations',
  }
);

sequelize.sync();
module.exports = Presentation;
