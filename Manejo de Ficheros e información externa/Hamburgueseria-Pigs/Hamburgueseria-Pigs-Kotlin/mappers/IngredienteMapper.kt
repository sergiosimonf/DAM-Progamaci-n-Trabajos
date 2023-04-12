package mappers

import dto.IngredienteDto
import dto.IngredienteListDto
import models.Ingrediente

fun IngredienteDto.toIngrediente() = Ingrediente(
    id = this.id,
    name = this.name,
    price = this.price
)

fun Ingrediente.toIngredienteDto() = IngredienteDto(  // Importante que sea IngredienteDto
    id = this.id,
    name = this.name,
    price = this.price
)

fun List<Ingrediente>.toDto() = IngredienteListDto(
    list_Ingredientes = map { it.toIngredienteDto() }
)

fun IngredienteListDto.toProductosList() = list_Ingredientes.map { it.toIngrediente() }
