-- DROP TABLE IF EXISTS ingredients;
-- DROP TABLE IF EXISTS recipes;
-- DROP TABLE IF EXISTS steps;
-- DROP TABLE IF EXISTS recipes_ingredients;
-- DROP TABLE IF EXISTS recipes_steps;

CREATE TABLE IF NOT EXISTS ingredients
(
    id           UUID PRIMARY KEY,
    name         VARCHAR(100) NOT NULL,
    category     VARCHAR(100) NOT NULL,
    amount       VARCHAR(50),
    cooking_time TIMESTAMP,
    recipe_id    UUID         NOT NULL
);

CREATE TABLE IF NOT EXISTS recipes
(
    id           UUID PRIMARY KEY,
    name         VARCHAR(100) NOT NULL,
    category     VARCHAR(100) NOT NULL,
    cooking_time TIMESTAMP    NOT NULL
);

CREATE TABLE IF NOT EXISTS steps
(
    id           UUID PRIMARY KEY,
    title        VARCHAR(100) NOT NULL,
    description  VARCHAR(500),
    cooking_time TIMESTAMP,
    photo_url    VARCHAR(1000),
    recipe_id    UUID         NOT NULL
);

CREATE TABLE IF NOT EXISTS recipes_ingredients
(
    recipe_id     UUID NOT NULL REFERENCES recipes (id) ON DELETE CASCADE,
    ingredient_id UUID NOT NULL REFERENCES ingredients (id) ON DELETE CASCADE
);

CREATE TABLE recipes_steps
(
    recipe_id UUID NOT NULL REFERENCES recipes (id) ON DELETE CASCADE,
    step_id   UUID NOT NULL REFERENCES steps (id) ON DELETE CASCADE
);