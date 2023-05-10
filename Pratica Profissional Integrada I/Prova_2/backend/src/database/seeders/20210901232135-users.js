const bcrypt = require('bcryptjs');

module.exports = {
  up: async (queryInterface, Sequelize) => {
    const password_hash = await bcrypt.hash('password', 8);

    return queryInterface.bulkInsert('Users', [
      {
        firstName: 'user',
        lastName: 'admin',
        email: 'admin@admin.com',
        password: password_hash,
        createdAt: new Date(),
        updatedAt: new Date(),
      },
    ]);
  },

  down: async (queryInterface, Sequelize) => {
    return queryInterface.bulkDelete('Users', null, {});
  },
};
