const add = require('./stringCalculator');

test('test input equals 9001', () => {
    expect(add("test input")).toBe(9001);
});