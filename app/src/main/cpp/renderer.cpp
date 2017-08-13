#include "renderer.h"
#include "glwrapper.h"

void on_surface_created() {
    glClearColor(0.0f, 1.0f, 0.0f, 0.0f);
}
 
void on_surface_changed(int w, int h) {
    // No-op
}
 
void on_draw_frame() {
    glClear(GL_COLOR_BUFFER_BIT);
}
