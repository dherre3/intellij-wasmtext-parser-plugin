(module
    (export "floor_M" (func $floor_M))
    (func $floor_M (param $arr_ptr i32) (result i32)
        (call $elementwise_mapping (get_local $arr_ptr)(i32.const -35))
    )
)